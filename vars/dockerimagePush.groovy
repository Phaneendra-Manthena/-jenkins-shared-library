def call (String project, String Imagetag, String hubUser){
    withCredentials([usernamePassword(
        credentialsId: 'docker-api',
        passwordVariable: 'PASS',
        usernameVariable: 'USER'
        )]) {
    sh "docker login -u '$USER' -p '$PASS'"
        }
      sh "docker push ${hubUser}/${project}:${ImageTag}"  
      sh "docker push ${hubUser}/${project}:latest"
}