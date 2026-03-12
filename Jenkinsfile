pipeline {
    agent any

    environment {
        ANDROID_HOME = "/home/roronoa/Android/Sdk"
        PATH = "$PATH:$ANDROID_HOME/platform-tools:$ANDROID_HOME/cmdline-tools/latest/bin"
    }

    stages {

        stage('Checkout Source') {
            steps {
                git url: 'https://github.com/your-username/android-ci-app.git', branch: 'main'
            }
        }

        stage('Build Android App') {
            steps {
                sh './gradlew assembleDebug'
            }
        }

        stage('Run Tests') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Archive APK') {
            steps {
                archiveArtifacts artifacts: 'app/build/outputs/**/*.apk'
            }
        }

    }
}
