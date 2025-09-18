def call() {
    echo 'Running tests...'
    sh '''
        . venv/bin/activate
        python3 -m pytest test.py -v
    '''
}
