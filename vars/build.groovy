def call() {
    echo "This is building the code"

    sh "docker build -t notes-app:latest ."
}
