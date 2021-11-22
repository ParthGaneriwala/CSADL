print("assume server0 created messageA;")
N = 200
for i in range(N):
    print(f"assume server{i} isConnectedTo server{i+1};")

print(f"guarantee server0 send messageA server{N};")