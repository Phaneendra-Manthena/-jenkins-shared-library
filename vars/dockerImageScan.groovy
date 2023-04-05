def call(String project, String Imagetag, String hubUser){
    sh "trivy image ${hubUser}/${project}:latest > scan.txt"
    sh "cat scan.txt"
}