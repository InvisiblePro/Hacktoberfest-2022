package main

import (
	"fmt"
	"os"
	"regexp"
)

func main() {

	var regex, _ = regexp.Compile(`(\+62 ((\d{3}([ -]\d{3,})([- ]\d{4,})?)|(\d+)))|(\(\d+\) \d+)|\d{3}( \d+)+|(\d+[ -]\d+)|\d+`)

	var isMatch = regex.MatchString(os.Args[1])
	if isMatch {
		fmt.Println(os.Args[1] + " is valid")
	} else {
		fmt.Println(os.Args[1] + " not valid")
	}
}
