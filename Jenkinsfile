pipeline{
    agent any
    
    environment{
    PATH = "/usr/share/apache-maven:$PATH"
    }
    stages{
        stage("Git checkout")
        {
            steps{
                git 'https://github.com/Mikky3554/demospingbootapp.git'
            }
        }
        stage("Maven build")
        {
            steps{
                sh "mvn clean package"
               # sh "mv /var/lib/jenkins/workspace/DeclarativePipeline/webapp/target/*.war /var/lib/jenkins/workspace/DeclarativePipeline/webapp/target/mywebapp01.war"
                
            }
        }
    }
    
}
