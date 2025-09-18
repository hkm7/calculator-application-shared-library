def call(String environment) {
    echo "Deploying to environment: ${environment}"
    sh "echo 'Deploying ${environment}...' "
}
