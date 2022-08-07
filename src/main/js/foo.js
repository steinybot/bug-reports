function foo(barOrBaz) {
	if ("bar" in barOrBaz) {
		console.log("It's a bar!")
	} else {
		console.log("It's a baz!")
	}
}
