<!-- as component to show up as a pop-up window on homepage -->

<template>
  <div>
    <div class="modal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>Modal body text goes here.</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">Save changes</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
  </div>

<!-- below is a modal sign in form template from https://mdbootstrap.com/docs/vue/modals/forms/#simple-login

<template>
  <mdb-container>
    <mdb-btn color="default" @click.native="login=true">launch login modal <mdb-icon icon="eye" class="ml-1"/></mdb-btn>
    <mdb-modal :show="login" @close="login = false">
      <mdb-modal-header class="text-center">
        <mdb-modal-title tag="h4" bold class="w-100">Sign in</mdb-modal-title>
      </mdb-modal-header>
      <mdb-modal-body class="mx-3 grey-text">
        <mdb-input label="Your email" icon="envelope" type="email" class="mb-5"/>
        <mdb-input label="Your password" icon="lock" type="password"/>
      </mdb-modal-body>
      <mdb-modal-footer center>
        <mdb-btn @click.native="login = false">Login</mdb-btn>
      </mdb-modal-footer>
    </mdb-modal>
  </mdb-container>
</template>
-->

</template>

<script>

// below is a modal sign in form template from https://mdbootstrap.com/docs/vue/modals/forms/#simple-login

  // import { mdbContainer, mdbBtn, mdbIcon, mdbModal, mdbModalHeader, mdbModalBody, mdbModalFooter, mdbInput, mdbModalTitle } from 'mdbvue';
  // export default {
  //   name: 'ModalExamplesPage',
  //   components: {
  //     mdbContainer,
  //     mdbBtn,
  //     mdbModal,
  //     mdbModalHeader,
  //     mdbModalBody,
  //     mdbModalFooter,
  //     mdbInput,
  //     mdbModalTitle,
  //     mdbIcon
  //   },
  //   data() {
  //     return {
  //       login: false
  //     }
  //   },
  // };


</script>


<style>

</style>