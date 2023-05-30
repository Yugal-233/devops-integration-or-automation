pipeline{
    agent any
    tools{
        maven "maven" 
    }
    stages{
        stage('Build maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Yugal-233/devops-integration-or-automation']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                bat 'docker build -t yugal233/devops-integration .'
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'docker hub images', variable: 'dockerpassword')]) {
                    bat 'docker login -u yugal233 -p Catia@123'
                    }
                    bat 'docker push yugal233/devops-integration'
                }
            }
        }
    }
}