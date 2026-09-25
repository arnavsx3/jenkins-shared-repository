def call() {
    sh '''
        osv-scanner scan source --recursive . \
          --format json \
          --output-file osv-report.json
    '''

    archiveArtifacts(
        artifacts: 'osv-report.json',
        fingerprint: true
    )
}
