# Java-code-for-a-simple-expression-grammar
Modify the code so it uses the following grammar:  &lt;expr> -> &lt;term> { &lt;add_op> &lt;expr> }  &lt;term> -> &lt;factor> { mult_op> &lt;term> }  &lt;factor> -> &lt;primary> '^' &lt;factor> | &lt;primary>  &lt;primary> -> '(' &lt;expr> ')'| identifier | number  &lt;add_op> -> '+' | '-'  &lt;mult_op> -> '*' | '/' | ‘%’
