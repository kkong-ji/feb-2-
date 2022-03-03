# codeup
# 3321

n = int(input())                 # 토핑 종류
a, b = map(int, input().split()) # 도우 가격, 토핑 가격
c = int(input())                 # 도우 칼로리
topping_arr = []                 # 토핑칼로리를 담은 배열 선언

for i in range(0, n):
    d = int(input())
    topping_arr.append(d)
topping_arr.sort(reverse=True)     # 토핑 칼로리를 내림차순 정렬

best_pizza = 0                     # 최고의 피자 선언
kcal = 0                           # 토핑 칼로리
cost = 0                           # 토핑 가격

for i in topping_arr:
    kcal += i                      # 토핑 칼로리를 배열의 순서대로 더함
    cost += b                      # 토핑 가격을 더함

    pizza = (c+kcal)/float(a+cost)
    if best_pizza > pizza:
        break
    else:
        best_pizza = pizza

print(int(best_pizza))