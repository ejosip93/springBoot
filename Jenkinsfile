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
                withMaven(maven : 'apache-maven-3.8.2') {
                                bat'mvn clean compile'
                            }
                script {
                    echo 'Pulling...' + env.BRANCH_NAME
                    withMaven(maven : 'apache-maven-3.8.2') {
                                    bat'mvn clean compile'
                                }
                    bat "SonarQubeScanner/bin/sonar-scanner"
                }
            }
        }
    }
}
