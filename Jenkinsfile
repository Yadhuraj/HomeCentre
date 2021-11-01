pipeline {
    agent any
	tools {
	maven 'M3'
	}
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
            
                }
        }
		
		stage('Test'){
		steps{
			bat 'mvn test'
			junit '**/tsrget/surefire-reports/TEST-*.xml'
		}
		}
		
		stage('Package')
		{
		steps{
		sh 'mvn package'
		}
		
		}
		
}
}