pipeline{
    agent any
    
    environment{
    PATH = "/opt/maven-3.3.9/bin:$PATH"
    }
    stages{
        stage("Git checkout")
        {
            steps{
                git 'https://github.com/Mikky3554/LiveProject.git'
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
