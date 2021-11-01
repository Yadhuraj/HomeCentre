pipeline {
    agent any
	
    stages {
        stage('Checkout') {
            steps {
              git 'https://github.com/Yadhuraj/HomeCentre.git'
            }
        }
        
        stage('Build')
        {
            steps {
                bat 'mvn clean compile'
		bat 'mvn clean test'
            
                }
        }
		
		stage('Test'){
		steps{
			bat 'mvn test'
			junit '**/target/surefire-reports/TEST-*.xml'
		}
		}
		
		stage('Package')
		{
		steps{
		bat 'mvn package'
		}
		
		}
		
}
}
