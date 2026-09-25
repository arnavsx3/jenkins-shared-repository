def call() {
    sh '''
        osv-scanner scan source --recursive .
    '''
}
