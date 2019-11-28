pipeline {
    agent { label 'java8' }
    environment {
        EMAIL_RECIPIENTS = 'josip.peric@decode.agency'
    }
    stages {
        stage('Build with unit testing') {
            steps {
                script {
                    echo 'Pulling...' + env.BRANCH_NAME
                }
            }
        }
    }
}
