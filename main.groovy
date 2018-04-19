job('unit1') {
    description 'unit testing 1'
    scm {
	git('https://github.com/slgevens/groovy-tests.git'){ node ->
	    node / gitConfigName('slgevens')
	    node / gitConfigEmail('evenssolignac@live.fr')
	}
    }
    triggers{
	scm('H/15 * * * *')
    }
    wrappers{
	nodejs('node-9-11-1')
    }
    steps{
	shell('npm install && npm test')
    }
}
