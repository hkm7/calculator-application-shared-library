def call() {
    echo 'Installing Python dependencies...'
    sh '''
        python3 -m venv venv
        . venv/bin/activate
        pip install --upgrade pip
        pip install -r requirements.txt
    '''
}
