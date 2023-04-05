def call(){
    sh 'mvn clean install'
}
post {
  success {
     echo 'Now Archiving...'
        archiveArtifacts artifacts: '**/target/*.war'
                }
            }