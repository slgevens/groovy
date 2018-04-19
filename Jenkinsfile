node{
    def commitid
    stage('git clone/pull'){
        checkout scm
        sh "git rev-parse --short head > .git/commit-id"
        commitid = readFile(".git/commit-id").trim()
    }
    stage('test'){
        nodejs(nodeJS installation name: "node-9-11-1"){
            sh "npm install"
            sh "npm test"
        }
    }
    
