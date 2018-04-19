node{
    def commitid
    stage('git clone/pull'){
        checkout scm
        sh "git rev-parse --short HEAD > .git/commit-id"
        commitid = readFile(".git/commit-id").trim()
    }
    stage('test'){
        nodejs(nodeJSInstallationName: "nodejs-9-11-1"){
            sh "npm install"
            sh "npm test"
        }
    }
}
