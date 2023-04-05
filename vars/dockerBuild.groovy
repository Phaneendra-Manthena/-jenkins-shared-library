def call(String project, String Imagetag, String hubUser){
    sh """
    docker build -t ${hubUser}/${project} .
    docker tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
    docker tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}