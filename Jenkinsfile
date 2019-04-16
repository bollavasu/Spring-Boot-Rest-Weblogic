node {   
        stage('SCM Checkout') {
           git 'https://github.com/bollavasu/Spring-Boot-Rest-Weblogic'
        }
        
        stage('Compile-Package') {
           bat 'mvn package'
        }
}
