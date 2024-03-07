typedef struct {
    // User defined data may be declared here.
    sem_t HSema , OSema;
    pthread_barrier_t OBarrier;
    pthread_mutex_t OMutex;
    pthread_cond_t OCond;
} H2O;

H2O* h2oCreate() {
    H2O* obj = (H2O*) malloc(sizeof(H2O));
    pthread_barrier_init(&obj->OBarrier, NULL , 2);
    sem_init(&obj->HSema , 0 ,2 );
    sem_init(&obj->OSema , 0 ,0 );
    pthread_mutex_init(&obj->OMutex ,  NULL);
    pthread_cond_init(&obj->OCond,NULL);
    // Initialize user defined data here.
    
    return obj;
}

void hydrogen(H2O* obj) {
    // releaseHydrogen() outputs "H". Do not change or remove this line.
    sem_wait(&obj->HSema);
    releaseHydrogen();
    pthread_barrier_wait(&obj->OBarrier);
    sem_post(&obj->OSema);
    pthread_cond_signal(&obj->OCond);
}

void oxygen(H2O* obj) {

    pthread_mutex_lock(&obj->OMutex);
    sem_wait(&obj->OSema);

    while(sem_wait(&obj->OSema) != 0){
        pthread_cond_wait(&obj->OCond,&obj->OMutex);
    }

    // releaseOxygen() outputs "O". Do not change or remove this line.
    releaseOxygen();
    sem_post(&obj->HSema);
    sem_post(&obj->HSema);
    pthread_mutex_unlock(&obj->OMutex);
    
}

void h2oFree(H2O* obj) {
    // User defined data may be cleaned up here.
    sem_destroy(&obj->HSema);
    sem_destroy(&obj->HSema);
    pthread_barrier_destroy(&obj->OBarrier);
    pthread_cond_destroy(&obj->OCond);
    free(obj);
}
