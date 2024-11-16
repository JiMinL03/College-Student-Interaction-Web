document.addEventListener('DOMContentLoaded', function () {
    const hamburger = document.getElementById('hamburger');
    const menu = document.getElementById('menu');

    hamburger.addEventListener('click', function() {
        hamburger.classList.toggle('open');
        menu.style.right = menu.style.right === '0px' ? '-250px' : '0px'; // 메뉴 위치를 오른쪽으로 토글
    });
});

/*저장입력*/ 
document.getElementById('save-btn').addEventListener('click', function() {
    alert('저장되었습니다!');
});


document.addEventListener("DOMContentLoaded", function() {
    const addButton = document.getElementById("add-btn");
    const priorityList = document.getElementById("priority-list");

    // priorityList가 존재하는지 확인
    if (priorityList && addButton) {
        addButton.addEventListener("click", function() {
            const itemCount = priorityList.getElementsByClassName("priority-item").length + 1;

            // 새로운 priority-item 컨테이너 생성
            const newItem = document.createElement("div");
            newItem.className = "priority-item";

            // bullet div 추가
            const bullet = document.createElement("div");
            bullet.className = "bullet";
            newItem.appendChild(bullet);

            // 고유한 placeholder를 가진 입력 필드 추가
            const input = document.createElement("input");
            input.type = "text";
            input.className = "priority-input";
            input.placeholder = `우대사항${itemCount}`;
            newItem.appendChild(input);

            // priority-list에 새로운 항목 추가
            priorityList.appendChild(newItem);

            alert('버튼이 작동합니다!');
        });
    } else {
        console.error("priorityList 또는 addButton 요소를 찾을 수 없습니다.");
    }
});

