def call() {
    sh '''
        docker run --rm \
            --network anon-feedback_default \
            -v "$PWD:/zap/wrk/:rw" \
            ghcr.io/zaproxy/zaproxy:stable \
            zap-baseline.py \
            -t http://nginx:8080 \
            -r zap-report.html \
            -J zap-report.json
    '''

    archiveArtifacts(
        artifacts: 'zap-report.html,zap-report.json',
        fingerprint: true
    )
}
