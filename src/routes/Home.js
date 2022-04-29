import React from 'react';
import { Link } from 'react-router-dom';

class Home extends React.Component {
  render() {
    return (
      <div>
        <header class="container">
          <div class="p-5 mb-4 bg-light rounded-3 text-center">
            <div class="container-fluid py-5">
              <h1 class="display-5 fw-bold">React와 SpringBoot를 활용한 게시판</h1>
              <p>목록 보기</p>
            </div>
          </div>
        </header>
        <main class="container">
          <section>
            <article class="row">
              <div class="col">
                <table class="table table-hover table-stripe text-center">
                  <colgroup>
                    <col width="10%" />
                    <col width="40%" />
                    <col width="15%" />
                    <col width="15%" />
                    <col width="10%" />
                  </colgroup>
                  <thead>
                    <tr>
                      <th>글 번호</th>
                      <th>제목</th>
                      <th>글쓴이</th>
                      <th>등록시간</th>
                      <th>조회수</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1</td>
                      <td>테스트제목</td>
                      <td>테스터</td>
                      <td>2022.04.29 12:50:00</td>
                      <td>0</td>
                    </tr>
                    <tr>
                      <td>2</td>
                      <td>테스트제목</td>
                      <td>테스터</td>
                      <td>2022.04.29 12:50:00</td>
                      <td>0</td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <div class="d-flex justify-content-end">
                <button class="btn btn-primary">
                  <Link to="/Write">글쓰기</Link>
                </button>
              </div>
            </article>
          </section>
        </main>
        <footer class="container-fluid mt-5 py-5 border-top">
          <p class="lead text-mute text-center">made by lyk</p>
        </footer>
      </div>
    );
  }
}

export default Home;
