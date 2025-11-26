//계정 스토어 구현
//frontend/src/stores/account.js
import {defineStore} from 'pinia'//pinia라이브러리를 사용

//'pinia에서 제공하는 dfineStore 메서드를 호출해서 스토어를 정의하였다.

export const useAccountStore = defineStore("account", { // ① 스토어의 고유 식별자

    state: () => ({
        checked: false, // ②속성정의 사용자의 로그인 체크 여부 프로퍼티
        loggedIn: false, // ③속성정의 사용자의 로그인 여부 프로퍼티
    }),
    actions: {//액션속성에 대한 set메서드가 있는거임
        setChecked(val) { // ④ > 사용자의 로그인 체크 여부 값을 수정하는 메서드
            this.checked = val;
        },
        setLoggedIn(val) { // ⑤ -> 사용자의 로그인 여부 값을 수정하는 메서드
            this.loggedIn = val;
        },
    },
});
