pipeline {
    agent any

    stages {

        // stage('Clone Repo') {
        //     steps {
        //         git branch: 'main', url: 'https://github.com/akshatsharma-aks/company-insights-app.git'
        //     }
        // }

        stage('Build Backend') {
            steps {
                dir('backend') {
                    bat 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build Docker Images') {
            steps {
                bat 'docker-compose build'
            }
        }

        stage('Run Containers') {
            steps {
                bat 'docker-compose up -d'
            }
        }
    }
}