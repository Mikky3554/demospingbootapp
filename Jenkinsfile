pipeline{
    agent any
   
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
           
                
            }
        }
    }
    
}
