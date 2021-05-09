pipeline{
agent any
stages 
{
stage('Build & Compile Staging') {
steps {
withMaven(maven : 'Maven_3.8.1') {
   sh 'mvn clean compile'
}
}
}
stage('Testing Stage') {
steps {
withMaven(maven : 'Maven_3.8.1') {
   sh 'mvn test'
}
}
}
stage('Deployment Stage') {
steps {
withMaven(maven : 'Maven_3.8.1') {
   sh 'mvn deploy'
}
}
}

}
}
