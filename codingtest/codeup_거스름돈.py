n = int(input())
count = 0

coin_types = [50000, 10000, 5000, 1000, 500, 100, 50, 10]

for coin in coin_types:     # coin_types를 for문 돌면서
    count += n // coin      # count에 n을 coin_types 로 나눈 몫을 더한다.
    n = n % coin            # n에는 n을 coin_types 으로 나눈 나머지를 대입하면서 나눌 값을 줄여나감

print(count)