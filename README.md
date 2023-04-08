# MyOwn 깃허브 이용해보기  
1. 로컬에 이용하는 폴더를 리모트 저장소에 새로 옮길때  
리모트에 새 리파지토리 하나 생성을 하는데 Add readme 를 하지 않는다.  
cmd 창에서 cd c:\해당경로 이동  
git init  
git add .  
git commit -m "할 이름"  
git remote add origin 리파지토리 주소  
git branch -M main  
git push -u origin main  

2. 이미 존재하는 리파지토리(멍멍)를 로컬로 옮길때  
cmd 창에서 멍멍폴더가 새로 생겼음 하는 곳으로 경로 이동  
cd c:\해당경로 이동  
git clone 리파지토리 주소  
(리파지토리랑 똑같은 폴더명을 하나 생성해 주면서 그안이 연동된다)  

@git push -u origin main 에서  
-u는 처음 푸쉬할때만 로컬과 원격을 연결해준다. 이후엔 git push만 해도 된다  
@git push -f origin main 하면  
강제로 로컬의 파일을 원격에 올린다. 커밋도 삭제할 우려가 있다. 다 날라갈수 있으니 주의.  

