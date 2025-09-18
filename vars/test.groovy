def call() {
    echo 'Running tests...'
    sh '''
        . venv/bin/activate
        pytest
    '''
}
