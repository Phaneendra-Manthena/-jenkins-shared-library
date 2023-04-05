def call() {
    sh 'mvn test'
}
post {
   success{
        echo 'Generated Analysis Result'
      }
 }