pipeline {
    agent any
    stages {
        stage("stop previous running container"){
            steps{
                sh "docker-compose down"  
            }
        }
        stage("run the docker container"){
            steps{
                sh "docker-compose up --build -d"  
            }
        }
    }
}