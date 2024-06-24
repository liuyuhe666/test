package eval

type Expr interface {
	Eval(env Env) float64
	Check(vars map[Var]bool) error
}

// 变量
// eg: x
type Var string

// 数字常量
// eg: 3.14
type literal float64

// 单目运算
// eg: +x, -x
type unary struct {
	op rune // +, -
	x  Expr
}

// 二目运算
// eg: x + y, x - y, ...
type binary struct {
	op   rune // + - * /
	x, y Expr
}

// 调用函数
// eg: sin(x), sqrt(x), ...
type call struct {
	fn   string // pow, sin, sqrt
	args []Expr
}
