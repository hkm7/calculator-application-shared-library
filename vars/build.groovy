def call() {
    echo 'Running build: pip install'
    sh '''
        . venv/bin/activate
        pip install .
    '''
}
