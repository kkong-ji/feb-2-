pasta_1 = float(input())
pasta_2 = float(input())
pasta_3 = float(input())
juice_1 = float(input())
juice_2 = float(input())
# pasta와 juice의 입력값을 float으로 형 변환후 입력값을 받도록 한다.

pasta = [pasta_1, pasta_2, pasta_3]
# pasta list 변수를 생성하고 pasta_1, pasta_2, pasta_3의 값을 넣는다.

pasta.sort()
# 오름차순 정렬

juice = [juice_1, juice_2]
# juice도 pasta와 동일한 방식으로 진행

juice.sort()
# 오름차순 정렬

min_price = (pasta[0] + juice[0] + ((pasta[0] + juice[0]) * 0.1))
# 세트 메뉴의 대금의 최소값은 pasta와 juice 인덱스 0번째 값(최소값)을 각각 더한 값에 10%를 더한 값이 될 것이다.

print(min_price)
# 출력