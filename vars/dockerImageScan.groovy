def call(){
    sh "trivy image ${hubUser}/${project}:latest > scan.txt"
    sh "cat scan.txt"
}