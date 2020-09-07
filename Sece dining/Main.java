a=input()
b=int(input())
if a=='front' or a=='FRONT':
  if b==1:
    print('Left Handed')
  elif b==2:
    print('Right Handed')
if a=='rear' or a=='REAR':
  if b==1:
    print('Right Handed')
  elif b==2:
    print('Left Handed')