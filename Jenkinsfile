pipeline {
    agent {
        label 'master'
    }
    environment {
        EMAIL_RECIPIENTS = 'josip.peric@decode.agency'
    }
    stages {
        stage('Build with unit testing') {
            steps {
                script {
                    echo 'Pulling...' + env.BRANCH_NAME
                    bat 'mvn clean install'
                    bat "SonarQubeScanner/bin/sonar-scanner"
                }
            }
        }
    }
}
