pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/dharanesh-vn/android-ci-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew build'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('My Sonar Server') {
                    sh './gradlew sonarqube'
                }
            }
        }
    }
}
