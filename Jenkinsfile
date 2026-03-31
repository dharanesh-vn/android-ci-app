pipeline {
    agent any

    environment {
        ANDROID_HOME = '/opt/android-sdk'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/dharanesh-vn/android-ci-app.git'
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
                    sh './gradlew sonar -Dsonar.token=$SONAR_AUTH_TOKEN'
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 15, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}
