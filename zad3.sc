// Dane
rok = [2015, 2017, 2019];
TVP = [4, 2, 3];
Polsat = [2, 0, 1];
TVN = [3, 4, 0];

// Tworzenie wykresu
figure
bar(rok, [TVP; Polsat; TVN]')
xlabel('Rok')
ylabel('Liczba oglądających w milionach')
title('Liczba oglądających telewizję w latach 2015, 2017, 2019')
legend('TVP', 'Polsat', 'TVN')
