import React from 'react';
import axios from 'axios';

class AxiosTest extends React.Component {
  getData = () => {
    // 스프링부트로 생성한 로컬 서버에 접속 시 오류가 발생함(CORS 오류)
    // CORS(Cross-Origin Resource Sharing) : http 헤더르 사용하여 한 출처에서 실행중인
    // 웹 애플리케이션이 다른 출처의 자원에 접근할 경우 오류가 발생한다
    // (즉, 스프링부트(localhost:9090)와 리액트(localhost:3000)의 서버 주소가 다름)
    //
    axios
      .get('/ajax/test?data=test') // 통신 에러(주소가 다르기 때문에.. 수정 필요)
      //.get('http://yts-proxy.now.sh/list_movies.json') // 통신 성공
      .then((res) => {
        console.log('통신 성공');
        console.log(res);
      })
      .catch((err) => {
        console.log('통신 실패');
        console.log(err);
      });
  };

  render() {
    return (
      <div>
        <h1>리액트 화면 테스트</h1>
        <button type="button" onClick={this.getData}>
          클릭시 서버와 통신
        </button>
      </div>
    );
  }
}

export default AxiosTest;
