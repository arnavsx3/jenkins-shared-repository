def call() {
    echo "This is cloning the code"

    git url: "https://github.com/arnavsx3/django-notes-app.git", branch: "main"

    echo "Code cloning successful"
}