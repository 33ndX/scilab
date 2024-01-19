// a
x = linspace(0, 1, 100); /


f1 = acos(2*x);
f2 = (x.^2 + 4*x) ./ (4*x.^2 + 3*x + 5);

plot(x, f1, '-r', x, f2, '-b')
legend('arccos(2x)', '(x^2 + 4x)/(4x^2 + 3x + 5)')
xlabel('x')
ylabel('y')
title('Comparison of two functions')
