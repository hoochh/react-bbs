import React from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

class Detail extends React.Component {
  state = {
    boardNo: 0,
    title: '',
    contents: '',
    userId: '',
    createDate: '',
    hitCnt: 0,
  };
  componentDidMount() {
    const boardNo = this.props.match.params.boardno;
    const url = `/ajax/boardDetail/${boardNo}`;

    axios
      .get(url)
      .then((res) => {
        console.log('통신 성공');
        console.log(res.data);
        this.setState({
          boardNo: res.data.boardNo,
          title: res.data.title,
          contents: res.data.contents,
          userId: res.data.createId,
          createDate: res.data.createDate,
          hitCnt: res.data.hitCnt,
        });
      })
      .catch((err) => {
        console.log('통신 실패');
        console.log(err);
      });
  }

  render() {
    const data = this.props.match.params.boardno;
    console.log(data);
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
            <article>
              <div class="row">
                <div class="row my-3">
                  <div class="col-sm-12">
                    <input
                      type="text"
                      class="form-control"
                      id="title"
                      value={this.state.title}
                    ></input>
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="row my-3">
                  <div class="col-sm-4">
                    <input
                      type="text"
                      class="form-control"
                      id="create-id"
                      value={this.state.userId}
                    ></input>
                  </div>
                  <div class="col-sm-4">
                    <input
                      type="text"
                      class="form-control"
                      id="hit-cnt"
                      value={this.state.hitCnt}
                    ></input>
                  </div>
                  <div class="col-sm-4">
                    <input
                      type="text"
                      class="form-control"
                      id="create-date"
                      value={this.state.createDate}
                    ></input>
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="row my-3">
                  <div class="col-sm-12">
                    <textarea
                      rows="10"
                      class="form-control"
                      id="content"
                      value={this.state.contents}
                    ></textarea>
                  </div>
                </div>
              </div>
              <div class="clearfix">
                <button class="btn btn-secondary float-start">
                  <Link to="/">목록</Link>
                </button>
                <button class="btn btn-warning float-end mx-1">삭제</button>
                <button class="btn btn-primary float-end">수정</button>
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

export default Detail;
